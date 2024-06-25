package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussziliaoxiazaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussziliaoxiazaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussziliaoxiazaiView;


/**
 * 资料下载评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
public interface DiscussziliaoxiazaiService extends IService<DiscussziliaoxiazaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussziliaoxiazaiVO> selectListVO(Wrapper<DiscussziliaoxiazaiEntity> wrapper);
   	
   	DiscussziliaoxiazaiVO selectVO(@Param("ew") Wrapper<DiscussziliaoxiazaiEntity> wrapper);
   	
   	List<DiscussziliaoxiazaiView> selectListView(Wrapper<DiscussziliaoxiazaiEntity> wrapper);
   	
   	DiscussziliaoxiazaiView selectView(@Param("ew") Wrapper<DiscussziliaoxiazaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussziliaoxiazaiEntity> wrapper);
   	
}

