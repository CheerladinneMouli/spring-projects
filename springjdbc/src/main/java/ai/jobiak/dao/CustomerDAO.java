package ai.jobiak.dao;
import org.springframework.jdbc.core.JdbcTemplate;
public class CustomerDAO {
	//performs CRUD operations with the Customer table,hence needs JdbcTemplate
	private JdbcTemplate mysqlTemplate;
	
	public int insertRow() {
		return mysqlTemplate.update("insert into customer values(199,'Michel Lee',4000)");
	}

}
