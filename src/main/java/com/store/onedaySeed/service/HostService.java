package com.store.onedaySeed.service;

import com.store.onedaySeed.entity.Host;
import com.store.onedaySeed.repository.HostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class HostService {

    private final HostRepository hostRepository;

    //아무 이상 없다면 host 정보 저장
    public Host saveHost (Host host){
        validateDuplicateHost(host);
        return hostRepository.save(host);
    }

    //중복되는 사업자 번호가 있다면 에러 메세지 노출
    private void validateDuplicateHost(Host host){
        Host findHost = hostRepository.findByHostNum(host.getHostNum());
        if(findHost != null){
            throw new IllegalStateException("이미 가입된 사업자번호입니다.");
        }
    }

}
