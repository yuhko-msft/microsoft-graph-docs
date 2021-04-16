---
title: "Create remoteAssistancePartner"
description: "Create a new remoteAssistancePartner object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create remoteAssistancePartner
Namespace: microsoft.graph



Create a new [remoteAssistancePartner](../resources/remoteassistancepartner.md) object.

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
POST /deviceManagement/remoteAssistancePartners
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [remoteAssistancePartner](../resources/remoteassistancepartner.md) object.

The following table shows the properties that are required when you create the [remoteAssistancePartner](../resources/remoteassistancepartner.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|Display name of the partner.|
|lastConnectionDateTime|DateTimeOffset|Timestamp of the last request sent to Intune by the TEM partner.|
|onboardingRequestExpiryDateTime|DateTimeOffset|When the OnboardingStatus is Onboarding, This is the date time when the onboarding request expires.|
|onboardingStatus|remoteAssistanceOnboardingStatus|A friendly description of the current TeamViewer connector status. Possible values are: `notOnboarded`, `onboarding`, `onboarded`.|
|onboardingUrl|String|URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.|



## Response

If successful, this method returns a `201 Created` response code and a [remoteAssistancePartner](../resources/remoteassistancepartner.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_remoteassistancepartner_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/remoteAssistancePartners
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
  "truncated": true,
  "@odata.type": "microsoft.graph.remoteAssistancePartner"
}
-->
``` http
HTTP/1.1 201 Created
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

