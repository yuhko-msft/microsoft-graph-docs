---
title: "Update remoteAssistancePartner"
description: "Update the properties of a remoteAssistancePartner object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update remoteAssistancePartner
Namespace: microsoft.graph



Update the properties of a [remoteAssistancePartner](../resources/remoteassistancepartner.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /deviceManagement/remoteAssistancePartners/{remoteAssistancePartnerId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [remoteAssistancePartner](../resources/remoteassistancepartner.md) object.

The following table shows the properties that are required when you update the [remoteAssistancePartner](../resources/remoteassistancepartner.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|Display name of the partner.|
|lastConnectionDateTime|DateTimeOffset|Timestamp of the last request sent to Intune by the TEM partner.|
|onboardingRequestExpiryDateTime|DateTimeOffset|When the OnboardingStatus is Onboarding, This is the date time when the onboarding request expires.|
|onboardingStatus|remoteAssistanceOnboardingStatus|A friendly description of the current TeamViewer connector status. Possible values are: `notOnboarded`, `onboarding`, `onboarded`.|
|onboardingUrl|String|URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.|



## Response

If successful, this method returns a `200 OK` response code and an updated [remoteAssistancePartner](../resources/remoteassistancepartner.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_remoteassistancepartner"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/remoteAssistancePartners/{remoteAssistancePartnerId}
Content-Type: application/json
Content-length: 267

{
  "@odata.type": "#microsoft.graph.remoteAssistancePartner",
  "displayName": "String",
  "lastConnectionDateTime": "String (timestamp)",
  "onboardingRequestExpiryDateTime": "String (timestamp)",
  "onboardingStatus": "String",
  "onboardingUrl": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.remoteAssistancePartner",
  "id": "e017f0bb-f0bb-e017-bbf0-17e0bbf017e0",
  "displayName": "String",
  "lastConnectionDateTime": "String (timestamp)",
  "onboardingRequestExpiryDateTime": "String (timestamp)",
  "onboardingStatus": "String",
  "onboardingUrl": "String"
}
```

