package com.project.demo.mapper;

import com.project.demo.entity.NewsCate;
import com.project.demo.entity.NewsCateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NewsCateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    int countByExample(NewsCateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    int deleteByExample(NewsCateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    int insert(NewsCate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    int insertSelective(NewsCate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    List<NewsCate> selectByExampleWithRowbounds(NewsCateExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    List<NewsCate> selectByExample(NewsCateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    NewsCate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    int updateByExampleSelective(@Param("record") NewsCate record, @Param("example") NewsCateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    int updateByExample(@Param("record") NewsCate record, @Param("example") NewsCateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    int updateByPrimaryKeySelective(NewsCate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cate
     *
     * @mbggenerated Wed Apr 20 13:40:29 CST 2016
     */
    int updateByPrimaryKey(NewsCate record);
}