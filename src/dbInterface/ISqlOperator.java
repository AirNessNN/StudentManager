package dbInterface;

import java.util.List;

/**
 * 数据库操作接口 <br/>
 * <li>search( 键，值)：查询操作，键值对应</li>
 * <li>insert（值[ ]：增加一条数据</li>
 * <li>update(值[ ]) ：更新数据</li>
 * <li>delete(键)：删除一条数据</li>
 * <li>getDataSize()：获取总数据数量</li>
 * @author AN
 *
 */
public interface ISqlOperator {
	/**
	 * 搜索
	 * @param keys 键集合
	 * @param values 值集合
	 * @return List的包装类
	 */
	List<?extends Object> search(String[] keys ,String[] values);
	
	/**
	 * 插入数据
	 * @param values 插入值的集合
	 * @return 成功返回true 失败返回false
	 */
	boolean insert(String[] values);
	
	/**
	 * 修改数据
	 * @param values 要修改的数据
	 * @return true修改完成，false未找到或失败
	 */
	boolean update(String[] values);
	
	
	/**
	 * 删除一条数据
	 * @param key 删除依据必须的字段
	 * @return 成功返回true 失败返回false
	 */
	boolean delete(String key);
	
	/**
	 * 获取总数据量
	 * @return 返回表中所有数据数量
	 */
	long getDataSize();
	
}
