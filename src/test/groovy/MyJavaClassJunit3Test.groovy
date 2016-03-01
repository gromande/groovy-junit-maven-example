import com.groman.MyJavaClass
class MyJavaClassJunit3Test extends GroovyTestCase {

    void setUp() {
        println "Inside setup()"
    }

    void test1() {
        println "Running test 1"
        MyJavaClass my = MyJavaClass.newInstance()
        assertEquals("Hola", my.method1())
    }

    void test2() {
        println "Running test 2"
        MyJavaClass my = MyJavaClass.newInstance()
        assertEquals("Adios", my.method2())
    }

    void tearDown() {
        println "Inside tearDown()"
    }
}
