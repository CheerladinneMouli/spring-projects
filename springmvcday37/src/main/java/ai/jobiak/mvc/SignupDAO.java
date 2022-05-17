package ai.jobiak.mvc;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;

public class SignupDAO 
{
	private JdbcTemplate mysqlTemplate;
	
	
	public JdbcTemplate getMysqlTemplate() {
		return mysqlTemplate;
	}



	public void setMysqlTemplate(JdbcTemplate mysqlTemplate) {
		this.mysqlTemplate = mysqlTemplate;
	}



		public Boolean insertRow(String name,String email,String mobile)
		{
		
			 String query="insert into signup values(?,?,?)";  
			    return mysqlTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
			    
			    @Override  
			    public Boolean doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			              
			        ps.setString(1,name);  
			        ps.setString(2,email);  
			        ps.setString(3,mobile);  
			              
			        return ps.execute();  
			              
			    }  
			    });  
			}
		
		
}





