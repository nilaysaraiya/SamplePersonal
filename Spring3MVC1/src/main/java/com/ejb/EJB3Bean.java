package com.ejb;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.hibernate.Session;

import com.hibernate.user.Bonus;
import com.hibernate.user.BonusId;
import com.hibernate.user.Dbuser;
import com.hibernate.user.Ordercategorydetails;
import com.hibernate.user.Ordercategorymaster;
import com.hibernate.util.HibernateUtil;

/**
 * Session Bean implementation class EJB3Bean
 */
//@Stateless(name="ejb/HibernateEJBBean", mappedName = "ejb/HibernateEJBBean")
@Stateless
//@LocalBean
//@Resource (name="ejb/HibernateEJBBean")
@EJB(name="ejb/HibernateEJBBean", beanInterface=EJB3BeanRemote.class)
public class EJB3Bean implements EJB3BeanRemote {

    /**
     * Default constructor. 
     */
    public EJB3Bean() {
        
    }
    
    public String getCategoryList() {
    	
    	Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		// User Data
		Dbuser user = new Dbuser();
 		user.setUserId(110);
		user.setUsername("superman4");
		user.setCreatedBy("system4");
		user.setCreatedDate(new Date());
 		// session.save(user);
 		
 		// Bonus Data
 		String ename = "EName4";
 		String job = "JobDesc4";
 		BigDecimal sal = new BigDecimal(10004);
 		BigDecimal comm = new BigDecimal(20004);
 		BonusId bonusId = new BonusId(ename, job, sal, comm);
 		Bonus bonus = new Bonus(bonusId);
 		// session.save(bonus);
 		
 		// Get Order Category
 		Dbuser user1 = (Dbuser) session.get(Dbuser.class, new Integer(100));
 		user1 = (Dbuser) session.get(Dbuser.class, new Integer(109));
 		user1.getUsername();
 		
 		// Commit all transactions
		// session.getTransaction().commit();
    	
		return "Hello New Message: " + user1.getUsername();
	}
    
    public List<Ordercategorymaster> getOrderCategoryMaster() {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	// Get Order Category
//    	 Ordercategorymaster orderCategoryMaster = (Ordercategorymaster) session.get(Ordercategorymaster.class);
    	String hql = "from Ordercategorymaster o order by o.categoryid asc";
    	 List<Ordercategorymaster> allOrderCategory = session.createQuery(hql).list();
    	 session.close();
    	 return allOrderCategory;
//    	return "Hello New Message: ";
    } 
    
    public List<Ordercategorydetails> getOrderCategoryDetails() {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	// Get Order Category
//    	 Ordercategorymaster orderCategoryMaster = (Ordercategorymaster) session.get(Ordercategorymaster.class);
    	
//    	String hql = "FROM Ordercategorymaster AS mst  "
//    			+ "INNER JOIN OrdercategorydetailsId AS dtl ON mst.categoryid=dtl.categoryid"
//    			+ "WHERE mst.categoryid=1";
    	
    	String hql = " FROM Ordercategorymaster AS mst, OrdercategorydetailsId AS dtl  "
    			+ " WHERE mst.categoryid=dtl.categoryid AND mst.categoryid=1";
    	
//    	String hql = "FROM ordercategorydetails as dtl "
//    			+ "INNER JOIN ordercategorymaster as mst "
//    			+ "ON dtl.categoryid=mst.categoryid WHERE mst.categoryid=1";
    	 List<Ordercategorydetails> allOrderCategoryDetails = session.createQuery(hql).list();
    	 session.close();
    	 return allOrderCategoryDetails;
//    	return "Hello New Message: ";
    }
    
}
