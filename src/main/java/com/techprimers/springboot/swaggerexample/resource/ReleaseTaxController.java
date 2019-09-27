package com.techprimers.springboot.swaggerexample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.springboot.bean.ImportResultsResponse;
import com.techprimers.springboot.bean.RequestBean;
import com.techprimers.springboot.bean.ResponseBean;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

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
    
    
    
    @ApiOperation(value = "Gets the status of the given Release Tax Import request using handle (task id)")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "<PENDING|RUNNING|COMPLETED|FAILED|COMPLETED_WITH_ERRORS>"),
                    @ApiResponse(code = 403, message = "Authorization Error"),
                    @ApiResponse(code = 500, message = "Internal Server Error")
                    
            }
    )
    @GetMapping("/async/status/{handle}")
    public ResponseBean importStatus(@PathVariable String handle) {
        return new ResponseBean();
    }
    
    
    @ApiOperation(value = "Gets the results for given Release Tax Import request using handle (task id).")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "SUCCESSFUL,REJECTED"),
                    @ApiResponse(code = 403, message = "Authorization Error"),
                    @ApiResponse(code = 500, message = "Internal Server Error")
                    
            }
    )
    @GetMapping("/async/statusresult/{handle}")
    public ImportResultsResponse getImportRequestResult(@PathVariable String handle) {
        return new ImportResultsResponse();
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

