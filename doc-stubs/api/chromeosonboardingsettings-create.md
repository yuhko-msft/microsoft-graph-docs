---
title: "Create chromeOSOnboardingSettings"
description: "Create a new chromeOSOnboardingSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create chromeOSOnboardingSettings
Namespace: microsoft.graph



Create a new [chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) object.

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
POST /deviceManagement/chromeOSOnboardingSettings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) object.

The following table shows the properties that are required when you create the [chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastDirectorySyncDateTime|DateTimeOffset|The ChromebookTenant's LastDirectorySyncDateTime|
|lastModifiedDateTime|DateTimeOffset|The ChromebookTenant's LastModifiedDateTime|
|onboardingStatus|onboardingStatus|The ChromebookTenant's OnboardingStatus. Possible values are: `unknown`, `inprogress`, `onboarded`, `failed`.|
|ownerUserPrincipalName|String|The ChromebookTenant's OwnerUserPrincipalName|



## Response

If successful, this method returns a `201 Created` response code and a [chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_chromeosonboardingsettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/chromeOSOnboardingSettings
Content-Type: application/json
Content-length: 194

{
  "@odata.type": "#microsoft.graph.chromeOSOnboardingSettings",
  "lastDirectorySyncDateTime": "String (timestamp)",
  "onboardingStatus": "String",
  "ownerUserPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.chromeOSOnboardingSettings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.chromeOSOnboardingSettings",
  "id": "50f68cf5-8cf5-50f6-f58c-f650f58cf650",
  "lastDirectorySyncDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "onboardingStatus": "String",
  "ownerUserPrincipalName": "String"
}
```

