package org.codedecode.order.controller;

import org.codedecode.order.dto.OrderDTO;
import org.codedecode.order.dto.OrderDTOFromFE;
import org.codedecode.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {


    @Autowired
    private OrderService orderService;


    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFE  orderDTOFromFE) {
       OrderDTO  orderDTO =  orderService.saveOrderInDB(orderDTOFromFE);
       return new ResponseEntity<>(orderDTO, HttpStatus.CREATED);
    }
}
