package priv.ljh.operate.mapper;

import io.swagger.annotations.ApiModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import priv.ljh.operate.entity.AdminUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lijinghai
 * @since 2021-01-26
 */
@Mapper
@Repository
@ApiModel("用户信息接口类")
public interface AdminUserMapper extends BaseMapper<AdminUser> {

}
