package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiliaoxiazaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiliaoxiazaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiliaoxiazaiView;


/**
 * 资料下载
 *
 * @author 
 * @email 
 * @date 2021-04-17 20:29:23
 */
public interface ZiliaoxiazaiService extends IService<ZiliaoxiazaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiliaoxiazaiVO> selectListVO(Wrapper<ZiliaoxiazaiEntity> wrapper);
   	
   	ZiliaoxiazaiVO selectVO(@Param("ew") Wrapper<ZiliaoxiazaiEntity> wrapper);
   	
   	List<ZiliaoxiazaiView> selectListView(Wrapper<ZiliaoxiazaiEntity> wrapper);
   	
   	ZiliaoxiazaiView selectView(@Param("ew") Wrapper<ZiliaoxiazaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiliaoxiazaiEntity> wrapper);
   	
}

