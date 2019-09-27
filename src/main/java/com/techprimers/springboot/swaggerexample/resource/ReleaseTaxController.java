package com.techprimers.springboot.swaggerexample.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;
import com.techprimers.springboot.bean.RequestBean;
import com.techprimers.springboot.bean.ResponseBean;

@RestController
@RequestMapping("/eeo")
@Api(value = "E-Trade", description = "E-Trade swagger")
public class ReleaseTaxController {

    @ApiOperation(value = "Release tax details")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successful e-trade")
            }
    )
    @GetMapping("/async/ReleaseTax")
    public ResponseBean hello(@RequestBody RequestBean requestBody) {
        return new ResponseBean();
    }

    @ApiOperation(value = "Returns Hello World")
   // @PostMapping("/post")
    public String helloPost(@RequestBody final String hello) {
        return hello;
    }

    @ApiOperation(value = "Returns Hello World")
   // @PutMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }
}

