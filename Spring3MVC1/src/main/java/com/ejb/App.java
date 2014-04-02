package com.ejb;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		System.out.println( "Hello World!" );
//    		InitialContext initial = new InitialContext();
//    		//Context context;
//            Properties properties = new Properties();
////            properties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
//            //context = new InitialContext(properties);
//    		Context myEnv = (Context)initial.lookup("java:comp/env/HibernateEJBBean");
//            EJB3BeanRemote bean = (EJB3BeanRemote) initial.lookup("EJB3Bean");
            
            Context context;
            //Properties properties = new Properties();
            //System.out.println( "1");
            //properties.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.FSContextFactory");
            System.out.println( "2");
            //context = new InitialContext(properties);
            EJB3Bean bean = (EJB3Bean) new InitialContext().lookup("ejb/HibernateEJBBean");
            System.out.println( "3");
            //EJB3Bean bean = (EJB3Bean) context.lookup("ejb/HibernateEJBBean");
            
            System.out.println("TEST" + bean.getCategoryList());
    	} catch (Exception e) {
    		System.out.println("EEE " + e.getMessage());
    		
    	}
        
        
    }
}
