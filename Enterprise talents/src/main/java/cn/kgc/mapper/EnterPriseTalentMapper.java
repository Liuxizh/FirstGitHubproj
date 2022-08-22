package cn.kgc.mapper;

import cn.kgc.bean.EnterPriseTalent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EnterPriseTalentMapper {
    List<EnterPriseTalent> getAllTalentInfo();

    List<EnterPriseTalent> getAllTalentName(@Param("name")String name);

    List<EnterPriseTalent> getAllTalent(@Param("id")Integer id);

    int InsertTalent(@Param("enterPriseTalent") EnterPriseTalent enterPriseTalent);

    int updateTalent(@Param("enterPriseTalent") EnterPriseTalent enterPriseTalent);

    int deleteTalent(@Param("id") Integer id);
}
