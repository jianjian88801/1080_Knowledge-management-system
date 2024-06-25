package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiliaofenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiliaofenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiliaofenleiView;


/**
 * 资料分类
 *
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
public interface ZiliaofenleiService extends IService<ZiliaofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiliaofenleiVO> selectListVO(Wrapper<ZiliaofenleiEntity> wrapper);
   	
   	ZiliaofenleiVO selectVO(@Param("ew") Wrapper<ZiliaofenleiEntity> wrapper);
   	
   	List<ZiliaofenleiView> selectListView(Wrapper<ZiliaofenleiEntity> wrapper);
   	
   	ZiliaofenleiView selectView(@Param("ew") Wrapper<ZiliaofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiliaofenleiEntity> wrapper);
   	
}

