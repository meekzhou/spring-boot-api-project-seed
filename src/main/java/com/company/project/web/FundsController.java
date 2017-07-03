package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Funds;
import com.company.project.service.FundsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/03.
*/
@RestController
@RequestMapping("/funds")
public class FundsController {
    @Resource
    private FundsService fundsService;

    @PostMapping("/add")
    public Result add(Funds funds) {
        fundsService.save(funds);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(Integer id) {
        fundsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Funds funds) {
        fundsService.update(funds);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(Integer id) {
        Funds funds = fundsService.findById(id);
        return ResultGenerator.genSuccessResult(funds);
    }

    @GetMapping("/list")
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Funds> list = fundsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
