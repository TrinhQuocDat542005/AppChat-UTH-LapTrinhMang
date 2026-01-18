package uth.edu.appchat.Dtos;

import lombok.Data;

import java.util.List;

@Data
public class CreateGroupRequest {
    private String name;
    private String description;
    private List<String> members; // List username hoặc số điện thoại
}
