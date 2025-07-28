package org.codedecode.order.service;


import org.codedecode.order.dto.OrderDTO;
import org.codedecode.order.dto.OrderDTOFromFE;
import org.codedecode.order.dto.UserDTO;
import org.codedecode.order.entity.Order;
import org.codedecode.order.mapper.OrderMapper;
import org.codedecode.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    SequenceGenerator sequenceGenerator;

    public OrderDTO saveOrderInDB(OrderDTOFromFE orderDTOFromFE) {
        Integer newOrderId  = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = fetchUserDetailsFromUserID(orderDTOFromFE.getUserId());
        Order orderToBeSaved = new Order(newOrderId,orderDTOFromFE.getFoodItemsList(),orderDTOFromFE.getRestaurant(),userDTO);
        orderRepository.save(orderToBeSaved);



        return OrderMapper.INSTANCE.mapOrderDTOTOOrder1(orderToBeSaved);


    }

    private UserDTO fetchUserDetailsFromUserID(Integer userId) {
      return   restTemplate.getForObject("http://USER-SERVICE/user/get/"+userId, UserDTO.class);

    }
}
