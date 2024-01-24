package com.store.onedaySeed.entity;

import com.store.onedaySeed.constant.Role;
import com.store.onedaySeed.dto.HostFormDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;

@Entity
@Table(name="host")
@Getter
@Setter
@ToString
public class Host extends BaseEntity{

    @Id
    @Column(name = "host_num", unique = true)
    private String hostNum;

    @Column(nullable = false, name="host_name")
    private String hostName;

    @Column(nullable = false, name="phone_num")
    private String phoneNum;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public static Host createHost(HostFormDto hostFormDto){
        Host host = new Host();

        host.setHostName(hostFormDto.getHostName());
        host.setHostNum(hostFormDto.getHostNum());
        host.setPhoneNum(hostFormDto.getPhoneNum());
        host.setPassword(hostFormDto.getPassword());
        host.setRole(Role.HOST);

        return  host;
    }

}
