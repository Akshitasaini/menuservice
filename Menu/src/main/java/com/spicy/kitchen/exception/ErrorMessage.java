package com.spicy.kitchen.exception;

import java.time.LocalDateTime;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 @Setter
 @Getter
 @NoArgsConstructor
 @AllArgsConstructor
@XmlRootElement(name = "error")
public class ErrorMessage 
{
   
 
    //General error message about nature of error
    private String message;
    private Integer status;
    private LocalDateTime ErrorTime;
    //Specific errors in API request processing
    private List<String> details;
   
    
}