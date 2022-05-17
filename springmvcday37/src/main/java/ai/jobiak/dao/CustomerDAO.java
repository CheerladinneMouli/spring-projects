package ai.jobiak.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class CustomerDAO 
{
	private JdbcTemplate mysqlTemplate;

	public JdbcTemplate getMysqlTemplate() {
		return mysqlTemplate;
	}

	public void setMysqlTemplate(JdbcTemplate mysqlTemplate) {
		this.mysqlTemplate = mysqlTemplate;
	}
	
	public Boolean insertRow(int cusid,String name,double balance)
	{
	
		 String query="insert into customer values(?,?,?)";  
		    return mysqlTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		    
		    @Override  
		    public Boolean doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		              
		        ps.setInt(1,cusid);  
		        ps.setString(2,name);  
		        ps.setDouble(3,balance);  
		              
		        return ps.execute();  
		              
		    }  
		    });  
		}    
	}


