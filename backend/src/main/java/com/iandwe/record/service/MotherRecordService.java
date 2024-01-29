package com.iandwe.record.service;

import com.iandwe.record.dto.MotherRecordCreateRequestDto;
import com.iandwe.record.dto.MotherRecordReadReponseDto;
import com.iandwe.record.dto.MotherRecordUpdateRequestDto;

import java.util.List;

public interface MotherRecordService {

    Boolean create(MotherRecordCreateRequestDto dto);

    List<MotherRecordReadReponseDto> findAllByNum(Long num);

    Boolean update(MotherRecordUpdateRequestDto dto);
}
