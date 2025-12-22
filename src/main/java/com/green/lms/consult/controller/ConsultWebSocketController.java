package com.green.lms.consult.controller;

import com.green.lms.consult.vo.CellLockMessage;
import com.green.lms.consult.vo.ConsultInsertMessage;
import com.green.lms.consult.vo.ConsultUpdateMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ConsultWebSocketController {

    /**
     * 상담 데이터 업데이트 메시지 처리
     * 클라이언트가 /app/consult/update로 메시지를 보내면
     * 모든 구독자(/topic/consult/updates)에게 브로드캐스트
     */
    @MessageMapping("/consult/update")
    @SendTo("/topic/consult/updates")
    public ConsultUpdateMessage handleConsultUpdate(ConsultUpdateMessage message) {
        log.info("상담 업데이트 수신: {}", message);
        return message;
    }

    /**
     * 셀 편집 잠금 메시지 처리
     * 클라이언트가 /app/consult/lock로 메시지를 보내면
     * 모든 구독자(/topic/consult/locks)에게 브로드캐스트
     */
    @MessageMapping("/consult/lock")
    @SendTo("/topic/consult/locks")
    public CellLockMessage handleCellLock(CellLockMessage message) {
        log.info("셀 잠금 상태 변경: {}", message);
        return message;
    }

    /**
     * 신규 상담 등록 알림 메시지 처리
     * 클라이언트가 /app/consult/insert로 메시지를 보내면
     * 모든 구독자(/topic/consult/inserts)에게 브로드캐스트
     */
    @MessageMapping("/consult/insert")
    @SendTo("/topic/consult/inserts")
    public ConsultInsertMessage handleConsultInsert(ConsultInsertMessage message) {
        log.info("신규 상담 등록 알림: {}", message);
        return message;
    }
}
