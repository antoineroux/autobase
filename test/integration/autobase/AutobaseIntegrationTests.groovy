package autobase;

import liquibase.database.Database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.codehaus.groovy.grails.commons.ApplicationHolder;

import grails.test.*

class AutobaseIntegrationTests extends GrailsUnitTestCase implements ApplicationContextAware {
    
    ApplicationContext applicationContext
    
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testGetDatabaseShouldReturnAProvisionedDatabaseInstance() {
        Autobase.appCtxHolder.set(applicationContext)
        
        def database = Autobase.getDatabase()
        assertNotNull database
        assertTrue database instanceof Database
    }
}
