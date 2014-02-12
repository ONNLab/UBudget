package net.onnlab.crru.budget

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Department)
class DepartmentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

     void "Test that name must begin with an upper case letter"() {
       //when: 'the name begins with a lower letter'
        //def p = new Department(name: 'jeff')

       /* then: 'validation should fail'
        !p.validate()
		*/
        when: 'the name begins with an upper case letter'
        def p = new Department(name: 'Jeff')

        then: 'validation should pass'
        p.validate()
    }
}
