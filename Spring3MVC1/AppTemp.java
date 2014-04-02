package com.hibernate;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.Session;

import com.hibernate.util.HibernateUtil;
import com.hibernate.user.Bonus;
import com.hibernate.user.BonusId;
import com.hibernate.user.Dbuser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		// User Data
		Dbuser user = new Dbuser();
 		user.setUserId(107);
		user.setUsername("superman1");
		user.setCreatedBy("system1");
		user.setCreatedDate(new Date());
 		session.save(user);
 		
 		// Bonus Data
 		String ename = "EName1";
 		String job = "JobDesc1";
 		BigDecimal sal = new BigDecimal(10000);
 		BigDecimal comm = new BigDecimal(20000);
 		BonusId bonusId = new BonusId(ename, job, sal, comm);
 		Bonus bonus = new Bonus(bonusId);
 		session.save(bonus);
 		
 		// Commit all transactions
		session.getTransaction().commit();
    }
}
