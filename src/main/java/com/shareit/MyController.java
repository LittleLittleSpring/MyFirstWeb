package com.shareit;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@RequestMapping("/do")
    public String mydo()
{


    return "i am comming";
}


}
