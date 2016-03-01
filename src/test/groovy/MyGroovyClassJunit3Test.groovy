import MyGroovyClass
class MyGroovyClassJunit3Test extends GroovyTestCase {

    void setUp() {
        println "Inside setup()"
    }

    void test1() {
        println "Running test 1"
        MyGroovyClass my = MyGroovyClass.newInstance()
        assertEquals("Hello", my.method1())
    }

    void test2() {
        println "Running test 2"
        MyGroovyClass my = MyGroovyClass.newInstance()
        assertEquals("Bye", my.method2())
    }

    void tearDown() {
        println "Inside tearDown()"
    }
}
