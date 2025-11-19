package com.green.lms.consult.service;

import com.green.lms.consult.mapper.ConsultMapper;
import com.green.lms.consult.vo.ConsultVO;
import com.green.lms.consult.vo.ConsultVoForInsertStu;
import com.green.lms.stu.mapper.StuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsultService {
  private final ConsultMapper consultMapper;
  private final StuMapper stuMapper;

  //신규 상담 등록
  @Transactional(rollbackFor = Exception.class)
  public void insertConsult(ConsultVoForInsertStu consultVoForInsertStu){
    //신규 학번 조회
    int nextStuNum = stuMapper.selectNextStuNum();
    //신규 학생 등록
    consultVoForInsertStu.setStuNum(nextStuNum);
    stuMapper.insertNewStu(consultVoForInsertStu);
    //신규 상담 등록
    consultMapper.insertConsult(consultVoForInsertStu);
  }

  //신규 학생 등록 시 상담 이력 조회
  public List<ConsultVO> selectConsultHistory(ConsultVoForInsertStu consultVoForInsertStu){
    return consultMapper.selectConsultHistory(consultVoForInsertStu);
  }

}
