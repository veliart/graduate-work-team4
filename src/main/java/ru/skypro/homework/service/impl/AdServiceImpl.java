package ru.skypro.homework.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.AdDTO;
import ru.skypro.homework.dto.AdsDTO;
import ru.skypro.homework.dto.CreateOrUpdateAdDTO;
import ru.skypro.homework.dto.ExtendedAdDTO;
import ru.skypro.homework.service.AdService;

@Service
public class AdServiceImpl implements AdService {
    @Override
    public AdsDTO getAllAds() {
        return null;
    }

    @Override
    public AdDTO addAd(MultipartFile image, CreateOrUpdateAdDTO properties) {
        return null;
    }

    @Override
    public ExtendedAdDTO getAds(int id) {
        return null;
    }

    @Override
    public void removeAd(int id) {

    }

    @Override
    public AdDTO updateAds(int id, CreateOrUpdateAdDTO properties) {
        return null;
    }

    @Override
    public AdsDTO getAdsMe(String email) {
        return null;
    }

    @Override
    public String[] updateImage(int id, MultipartFile image) {
        return new String[0];
    }
}
