package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.Regvo;







@Repository
public class Regdao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void insert(Regvo v)
	{
		try{
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.save(v);
			
			transaction.commit();
			
			session.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
public List search(Regvo v1)
	
	{
		List ls=new ArrayList();
		try
			{
								
				Session session=sessionFactory.openSession();
				
				Transaction transaction=session.beginTransaction();
				
				Query q= session.createQuery("from Regvo where fn='"+v1.getFn()+"'");
				
				 ls=q.list();
				
				transaction.commit();
				
				session.close();
				
				
			}
		catch(Exception ex)
			{
				ex.printStackTrace();
			}
		System.out.println(ls.size());
		return ls;
	
	}


public void delete(Regvo v)
{
	try{
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		session.delete(v);
		
		transaction.commit();
		
		session.close();
		
	}catch(Exception e){
		e.printStackTrace();
		
	}
}

public List edit(Regvo v1)

{
	List ls=new ArrayList();
	try
		{
			
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Query q= session.createQuery("from Regvo where id='"+v1.getId()+"'");
		
		 ls=q.list();
		
		transaction.commit();
		
		session.close();
			
			
		}
	catch(Exception ex)
		{
			ex.printStackTrace();
		}
	System.out.println(ls.size());
	return ls;
}


public void update(Regvo v)
{
	try{
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		session.update(v);
		
		transaction.commit();
		
		session.close();
		
	}catch(Exception e){
		e.printStackTrace();
		
	}
}

	
}

