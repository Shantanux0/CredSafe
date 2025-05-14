package com.CredSafe.CredSafe.Services;

import com.CredSafe.CredSafe.io.ProfileRequest;
import com.CredSafe.CredSafe.io.ProfileResponse;

public interface ProfileService {


    ProfileResponse createProfile(ProfileRequest request);
    ProfileResponse getProfile(String email);
    void sendResetOtp(String email);
    void resetPassword(String email, String otp, String newPassword);
    void sendOtp(String email);
    void verifyOtp(String Otp,String email);



}
