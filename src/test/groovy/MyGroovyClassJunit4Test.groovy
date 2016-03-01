import org.junit.*
import MyGroovyClass
//Use GroovyAssert with groovy 2.3 or highers
import static groovy.test.GroovyAssert.*
//Use org.junit.Assert with older versions of groovy
//import static org.junit.Assert.*

class MyGroovyClassJunit4Test {

    @BeforeClass
    static void setUp() {
        println "Inside setup()"
    }

    @Before
    void before() {
        println "Inside before()"
    }

    @Test
    void myTest1() {
        println "Running test 1"
        MyGroovyClass my = MyGroovyClass.newInstance() 
        assertEquals("Hello", my.method1())
    }

    @Test
    void myTest2() {
        println "Running test 2"
        MyGroovyClass my = MyGroovyClass.newInstance()
        assertEquals("Bye", my.method2())
    }

    @After
    void after() {
        println "Inside after()"
    }

    @AfterClass
    static void tearDown() {
        println "Inside tearDown()"
    }
}
