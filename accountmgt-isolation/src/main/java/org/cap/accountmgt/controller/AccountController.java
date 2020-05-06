package org.cap.accountmgt.controller;

import org.cap.accountmgt.service.IWalletAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private IWalletAccountService service;


  
}
