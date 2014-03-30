package com;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemMapper {
    final String GET_ALL_ITEM = "select * from item_list";

    @Select(GET_ALL_ITEM)

public List<Item> getAllItem();


}
