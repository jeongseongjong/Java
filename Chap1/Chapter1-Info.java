/**
 * 1. 클래스 로더? ( What is ClassLoader? )
 *    먼저 자바 가상머신이 다루는 클래스에 관하여 다루어 보자
 *    클래스는 목적 파일이며 런타임 시 프로그램에서 동적으로 링크 될 수 있다
 *    모든 클래스는 참조 되는 순간 동적으로 로드 및 링크 된다
 *    이와 같은 일을 하는 곳이 ClassLoader 이다
 *
 * 2. 클래스 로더의 종류 ( How Many ClassLoader )
 *    먼저 알고 넘어 가야 할 사항이 있다
 *    JVM은 두 가지 라이프 타임을 가진다
 *    1. 컴파일 타임
 *    2. 런 타임
 *    컴파일 타임 시에는 자바의 소스 파일을 클래스라는 JVM이 관리 할 수 있는 목적 파일로 변환하는 동작을 한다
 *    다음으로 런타임에는 컴파일 된 목적 파일을 실행 하고 관리 함으로 써 애플리케이션을 동작 시킨다
 *    이 때 컴파일은 JavaC 프로그램이 하는 것이니 나중에 다룰 예정이며 지금은 Java.exe가 동작 하기 위하여
 *    컴파일된 클래스를 어떻게 로드(불러오고)되고 디플로이(적재되며)하며 링크(할당)되어 디스트로이(해지)에 관하여 다룰 것이다.
 *    먼저 클래스 로더의 종류에 관하여 다루어 보자
 *
 *    1. URLClassLoader : 다양한 형태(file:, ftp:, http:)로 부터 클래스를 로드 할 수 있도록 한다
 *    2. BootstrapClassLoader : 부트 스트랩 로더는 일반 적인 클래스 로더라기 보다는 Java Runtime library
 *              시스템과 관련 된 클래스를 로드 할 때 사용 된다. 자바의 환경 변수나 rt.jar와 같은
 *              런 타임 돌입 시에 필요한 클래스를 최초 로드 한다.
 *              (default 는 PATH:/jar/lib/*.jar 를 로드 한다)
 *    3. ExtClassLoader : 자바 확장 jar 들을 로드 한다. 또한 이 클래스 로더는 URL 클래스 로더를 확장한 클래스이다.
 *              따라서 다양한 형태의 외부 jar 파일을 로드 할 수 있다.
 *              (default 는 PATH:/jar/lib/ext/*.jar 를 로드 한다)
 *    4. AppClassLoader : 시스템 로더 또는 애플리케이션 로더 라고 부르며 java.class.path 에 정의 되어진 경로를 기준으로
 *              클래스를 로드 한다. 이 클래스 로더는 애플리케이션을 동작하는데 사용 되며 사용자나 개발자가 작성한 클래스를
 *              로드 할 때 사용 된다. 이 클래스 로더 역시 URL 클래스 로더를 확장한 클래스 이며 다양한 형태를 로드 할 수 있다
 *              (default 는 java.class.path/*.class)
 *    5. SecureClassLoader : ClassLoader 의 보안 규칙을 확장한 클래스 이다. 이 클래스는 클래스의 락킹과 여러 처리를
 *              제어 할 수 있다. 하지만 잘 사용 되지 않으며 URL 클래스 로더의 확장에 사용 되기도 한다.
 *
 *      그 외 appletClassLoade1,2,3 와 sessionClassLoder 등 이 있지만 추후에 다룰 예정이다
 *
 *
 * 3. 클래스 로더의 실행 순서 ( Runtime Flow of ClassLoader )
 *    먼저 런타임 시에도 두 가지 구분이 된다
 *    2-1 로드 타임 다이나믹 링크
 *    2-2 런 타임 다이나믹 링크
 *    로드 타임 다이나믹 링크의 경우는 클래스를 로드 하는 순간 같이 로드 되는 현상을 말한다
 *    런 타임 다이나믹 링크는 로드 타임이 끝난 후 임의적으로 로드를 하는 현상을 말한다.
 *
 * 4. 계층화 된 구조를 지는 클래스 로더 (Delegation ClassLoder)
 *    먼저 클래스 로더는 사다리식 구조를 지녔다는 것을 유의하자
 *    최초 로드 하는 bootstrap이 (1) 레벨이며 다음로 로드 되는 Ext가 (2) 레벨이고
 *    다음으로 로드 되는 app이 (3) 레벨이고 사용자가 등록 하는 Custom이 (4..) 레벨이다
 *    즉 모든 ClassLoader는 app의 자식이고 ext의 자식이며 bootstrap의 자식이다.
 *    이는 중요한 의미를 가진다.
 *    클래스 로더는 자신의 로더에 클래스가 적재(캐싱) 되어 있지 않다면 상위 컴포넌트인 클래스 로더로 책임을 위임한다.
 *    만일 부모 클랫 로더에도 존재 하지 않다면 findClass 메서드를 사용 하여 클래스를 로드 한다.
 *    먼저 방금 설명한 클래스 로더의 레벨 트리를 확인해 보자
 *
 *    BootstrapClassLoader
 *      |
 *      +-- ExtClassLoader
 *              |
 *              +-- AppClassLoader
 *                      |
 *                      +-- CustomClassLoader [1]
 *                      |       |
 *                      |       +-- CustomClassLoader [2]
 *                      |
 *                      +-- CustomClassLoader [3]
 *
 *
 *    아래와 같은 구조를 지닌다.
 *
 *    먼저 알아야 된 것은 classLoader 를 default 로 생성 시에는 app 클래스 로더를 parent 로 받는다.
 *    그러면 ClassLoader 가 동작 하는 순서를 살펴 보자
 *    String.Class를 찾는다고 가정해 보자
 *    1. CustomClassLoader.load(java.lang.String) 진입
 *    2. CustomClassLoader 의 스트링 클래스의 캐시가 없으므로 CustomClassLoader 는 자신의 부모 parent 로 위임
 *    3. ClassLoader 의 기본 parent 는 app 클래스 로드 이므로 appClassLoader 로 진입
 *    4. appClassLoader 역시 스크링 클래스가 캐시가 되어 있지 않으므로 상위 parent 인 ExtClassLoader 로 위임
 *    5. ExtClassLoader 역시 스트링 클래스가 캐시가 되어 있지 않으므로 상위 parent 인 BootstrapClassLoader 로 위임
 *      +-- 스트링 클래스이 캐시 되어 있다면 클래스를 찾았으므로 역행 하면서 해당 클래스를 리턴
 *      +-- 만일 캐시 되어 있지 않다면 findClass 메서드를 사용 하여 해당 클래스를 찾다가 없으면 ClassNotFoundException 을 발생하여 throw
 *          리턴 하면서 모든 클래스 로더들이 반복한다
 *
 *    이런 순서 대로 클래스 로더는 동작 한다. 즉 클래스 로더의 순서는
 *    BootstrapClassLoader -> ExtentionClsasLoader -> AppClassLoader -> CustomClassloader 순이다.
 *
 *    WAS 의 경우는 WAR 의 클래스 로더를 각각 적재 하기 위하여
 *    band 별로 나누고 관리 한다.
 *
 * 5. 실행 시 데이터를 관리 하는 공간 ( Runtime Data Area )
 * 	  ClassLoader가 JVM에게 바이트 코드인 클래스를 로드하여 클래스 인스턴스를 만들어 주는것 까지 설명 하였다.
 *    (클래스 인스턴스는 추후 리플랙션에서 다룰 예정이다.)
 *    그렇다면 이제 이 클래스 인스턴스를 받아서 사용하고 소멸되는 과정을 알아 보자.
 *    먼저 JVM에는 3가지 기억 공간이 존재 한다. 아마 자바를 조금이라도 공부 해 본 사람이라면 알고 있을 것이다.
 *    Method, Heap, Stack 이렇게 공간을 가지고 있다.
 *    보통의 책에서는 이렇게 정의 내린다.
 *     * Method : 스테틱한 클래스들이 저장 되는 공간
 *     * Heap : 인스턴스가 저장 되는 공간
 *     * Stack : WorkFlow가 실행 되는 공간
 *    사실 그 외에도 컴퓨터와는 다른 PC Registers와 GarbageCollection(GC)와 코드를 실행 시키는 Execution Engine이 있지만 후속에서 다루겠다.
 *    >>>(불변의 참조를 많이 하게 되면 GC의 Stop-World가 발생한다. stop-world는 GC가 해당 쓰래드를 제외한 모든 쓰레드의 작업을 중지 하는 행위이다.)
 *    
 *	    	>> Stack Frame <<
 *		먼저 살펴 볼 것은 스택 프레임이다. 실제로는 스택 프레임은 Local Variable Section과 Operand Stack, Frame Data 로 구현 되어 있지만
 *		자세히 다루지는 않고 간단하게 설명만 하고 넘어 가겠다.
 *		Local Variable Section : 메서드 상에서 데이터를 저장 하는 저장 공간이다.
 *		(선언 및 할당을 포함한다)
 *		Operand Stack : local variable에서 값을 로드 하여 값을 연산 하는 공간이다.
 *		(연산 작업을 처리 한다)
 *		Frame Data : 실행흐름을 참조 하기 위한 공간이다 에러나 try..catch statements 같은 참조 공간이다.
 *		(PC Register 값을 포함한다)
 *		스텍은 간단하게 생각 하고 넘어 가자 그냥 실행 되는 공간이다 라고 다만 스택은 먼저 들어 간게 맨 나중에 나오는 FILO 구조란 것만 기억하자.
 *
 *		>> Method Area <<
 *		메서드 영역은 클래스의 정보를 가지고 있는 공간이며 모든 쓰래드들이 공유 가능한 공유 풀 역활도 한다.
 *		이전까지 본 ClassLoader들이 클래스를 로드 하면 이 메서드 영역에 클래스 인스턴스를 만들어 클래스 정보를 로드 한다.
 *		그러면 이제 좀 더 깊게 들어 가 보자.
 *		이전에 공부한 ClassLoader 를 보자 .class 파일을 바이트 코드로 읽어서 로드 한다고 하였다.
 *		이 다음으로 하는 일이 로딩 된 클래스의 링킹이다.
 *		순서로는 
 *			Verification : 먼저 클래스의 정확성을 확인한다. 클래스에 포맷과 사이즈 그외 몇 가지 클래스 자체의 검증을 한다.
 *			Preparation : 클래스 인터페이스와 변수를 초기화 한 다음 현재 로드 된 클래스 바이트 코드와 매핑할 준비를 한다. (field는 default 값으로 초기화)
 *			resolution : 클래스 인스턴스 인터페이스와 로드 된 클래스들의 매핑을 한다.
 * 
 *		  ( **** 순서도 **** )
 *		[ CloaddLoader(byte .class Code) 
 *		-> Verification(validation .class code) 
 *		-> Preparation(initilize Class.class) 
 *		-> resolution(link .class Code and Class.class) ]
 *
 *		이 메타 데이터의 종류로는 아래와 같다
 *			
 *		ClassMataData +-- Type Information : 타입의 전체 이름(패키지.클래스)과 접근성(public, absract, final )과 클래스의 타입(class, interface)의 정보
 *					  +-- Constant Pool	  : Type에서 사용 된 모든 상수들의 정보를 가지고 있다. Method, Field, Type, Symbolic Reference(객체를 이름으로 참조)도 포함한
 *					  +-- Field Information : Type에서 사용 된 모든 Fieild 정보를 가지고 있다. 접근성(public, protected...), 타임명 등.
 *					  +-- Method Information : Type에서 선언된 모든 Method 정보를 가지고 있다. 접근성(public, private ...), Parameter 수와 타입, 리턴 입 등.
 *					  +-- Class Variables : Type에 선언된 전역적인 인터페이스들이 사용 가능한 변수를 가지고 있다. Final 변수는 상수로 변경 되어 Constant Pool이 소유 한다.
 *					  +-- Reference to ClassLoader : 자심의 클래스를 로드와 링킹 한 클래스 로더의 참조 값을 가지고 있다.
 *					  +-- Reference Class class : 각 타입이 로드 될 때마다 java.lang.class의 인스턴스를 하나씩 생성한다. getClass, forClass 등의 메서드를 호출 시 참조값 반환
 *
 * 		? Method Table : ClassMataData에 속해 있으며 class가 로드 될 때 해당 클래스의 참조 된 객체의 메서드를 테이블 형식으로 저장 하여 메서드 참조를 빠르게 수행한다.
 * 
 * 		>> Heap <<
 * 		힙 영역은 클래스 타입을 사용하여 객체화 된 인스턴스나 Array가 저장되는 공간이며 GC가 주기적으로 메모리를 해지 한다.
 * 
 * 		1장의 설명은 은 여기 까지 하고 다음 장은 ClassLoader와 Class인터페이스를 이용하여 간단하게 실습해 보도록 하겠다.
 *	
 *	  
 */
package Chap1;