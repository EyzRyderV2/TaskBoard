package com.eyz.TaskBoard.dto;

import com.eyz.TaskBoard.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO (Long id, int order, BoardColumnKindEnum kind){
}
