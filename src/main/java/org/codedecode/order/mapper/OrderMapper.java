package org.codedecode.order.mapper;

import org.codedecode.order.dto.OrderDTO;
import org.codedecode.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOTOOrder(OrderDTO orderDTO);

    OrderDTO mapOrderDTOTOOrder1(Order order);
}
