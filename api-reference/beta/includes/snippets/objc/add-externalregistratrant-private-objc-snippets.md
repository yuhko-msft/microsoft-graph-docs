---
description: "Automatically generated file. DO NOT MODIFY"
---

```objc

MSHTTPClient *httpClient = [MSClientFactory createHTTPClientWithAuthenticationProvider:authenticationProvider];

NSString *MSGraphBaseURL = @"https://graph.microsoft.com/beta/";
NSMutableURLRequest *urlRequest = [NSMutableURLRequest requestWithURL:[NSURL URLWithString:[MSGraphBaseURL stringByAppendingString:@"/me/onlineMeetings/MSpkYzE3Njc0Yy04MWQ5LTRhZGItYmZ/registration/registrants"]]];
[urlRequest setHTTPMethod:@"POST"];
[urlRequest setValue:@"application/json" forHTTPHeaderField:@"Content-Type"];

MSGraphMeetingRegistrant *meetingRegistrant = [[MSGraphMeetingRegistrant alloc] init];
[meetingRegistrant setId:@"30494ab7-7338-4592-bfec-a4333be2a0a6"];
[meetingRegistrant setTenantId:@"909c6581-5130-43e9-88f3-fcb3582cde37"];
[meetingRegistrant setUserId:@"cc515404-b55c-466e-b896-992c918ecc01"];

NSError *error;
NSData *meetingRegistrantData = [meetingRegistrant getSerializedDataWithError:&error];
[urlRequest setHTTPBody:meetingRegistrantData];

MSURLSessionDataTask *meDataTask = [httpClient dataTaskWithRequest:urlRequest 
	completionHandler: ^(NSData *data, NSURLResponse *response, NSError *nserror) {

		//Request Completed

}];

[meDataTask execute];

```