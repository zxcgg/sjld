package cn.cwx521.service.imp;

import cn.cwx521.mapper.UploadMapper;
import cn.cwx521.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    private UploadMapper uploadMapper;

    @Override
    public int insertFile(String upload) {
        return uploadMapper.insertSelective(upload);
    }
}
