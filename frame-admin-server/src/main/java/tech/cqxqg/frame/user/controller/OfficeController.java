package tech.cqxqg.frame.user.controller;

import com.swak.frame.dto.Pagination;
import com.swak.frame.dto.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tech.cqxqg.frame.user.dto.request.OfficesCommand;
import tech.cqxqg.frame.user.dto.request.OfficesPageReq;
import tech.cqxqg.frame.user.dto.vo.OfficesVo;
import tech.cqxqg.frame.user.service.OfficesService;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping("/offices")
public class OfficeController {
    @Resource
    private OfficesService officesService;
    @GetMapping(value = "/list")
    public Result<Pagination<OfficesVo>> queryOfficesList(OfficesPageReq query){
        return officesService.selectOfficesList(query);
    }
    @PostMapping(value = "/addOffices")
    public Result<Void> addOffices(@RequestBody OfficesCommand officesCommand){
        return officesService.addOffices(officesCommand);
    }
    @PutMapping(value = "/editOffices")
    public Result<Void> updateOffices(@RequestBody OfficesCommand officesCommand){
        return officesService.updateOffices(officesCommand);
    }
    @DeleteMapping(value = "/deleteOffices")
    public Result<Void> deleteOffices(@RequestBody List<Integer> ids){
        return officesService.deleteOfficesByIds(ids);
    }
}
