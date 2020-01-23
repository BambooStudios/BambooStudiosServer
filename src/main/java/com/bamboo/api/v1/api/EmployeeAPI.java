package com.bamboo.api.v1.api;

import com.bamboo.api.v1.services.EmployeeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.bamboo.api.v1.Constants.API_RELATIVE_VERSIONED_PATH;
import static com.bamboo.api.v1.Constants.Urls.EMPLOYEE_RELATIVE_PATH;

@RestController
@RequestMapping(API_RELATIVE_VERSIONED_PATH)
@Slf4j
@RequiredArgsConstructor
public class EmployeeAPI {
    @NonNull
    private EmployeeService employeeService;


    @Transactional
    @GetMapping(EMPLOYEE_RELATIVE_PATH)
    @ApiOperation(
            value = "Get employees"
    )
    public ResponseEntity getEmployees() {
        return ResponseEntity.ok(employeeService.findAll());
    }

}
