package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.ListPage;
import com.example.demo.entity.MyUser;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ListPage<MyUser> getPage(int pageIndex, int pageSize){
        int total = userRepository.selectCount(null).intValue();
        int start = (pageIndex - 1)*pageSize;
         ListPage<MyUser> result = new ListPage<>();
         var where = new QueryWrapper<>(MyUser.class)
         .last("limit " + start + ", " + pageSize);
         var items = userRepository.selectList(where);
        result.setTotal(total);
        result.setPageIndex(pageIndex);
        result.setPageCount(total/pageSize);
        result.setRows(items);
        return result;
    }

    public boolean add(MyUser user){
        return userRepository.insert(user) > 0;
    }

    public boolean update(MyUser user){
        var where = new QueryWrapper<>(MyUser.class).eq("nick_name", user.getName());
        // var where = new LambdaQueryWrapper<>(MyUser.class).eq(MyUser::getName, user.getName());
        return userRepository.update(user, where) > 0;
    }

    public boolean remove(String userName){
        var where = new QueryWrapper<>(MyUser.class).eq("name", userName);
        return userRepository.delete(where) > 0;
    }    

}
