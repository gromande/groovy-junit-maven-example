import org.junit.*
import com.groman.MyJavaClass
//Use GroovyAssert with groovy 2.3 or highers
import static groovy.test.GroovyAssert.*
//Use org.junit.Assert with older versions of groovy
//import static org.junit.Assert.*

class MyJavaClassJunit4Test {

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
        MyJavaClass my = MyJavaClass.newInstance() 
        assertEquals("Hola", my.method1())
    }

    @Test
    void myTest2() {
        println "Running test 2"
        MyJavaClass my = MyJavaClass.newInstance()
        assertEquals("Adios", my.method2())
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
