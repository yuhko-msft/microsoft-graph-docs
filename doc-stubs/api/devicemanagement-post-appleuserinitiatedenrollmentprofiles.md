---
title: "Create appleUserInitiatedEnrollmentProfile"
description: "Create a new appleUserInitiatedEnrollmentProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create appleUserInitiatedEnrollmentProfile
Namespace: microsoft.graph



Create a new appleUserInitiatedEnrollmentProfile object.

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
POST /deviceManagement/appleUserInitiatedEnrollmentProfiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [appleUserInitiatedEnrollmentProfile](../resources/appleuserinitiatedenrollmentprofile.md) object.

The following table shows the properties that are required when you create the [appleUserInitiatedEnrollmentProfile](../resources/appleuserinitiatedenrollmentprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|availableEnrollmentTypeOptions|[appleOwnerTypeEnrollmentType](../resources/appleownertypeenrollmenttype.md) collection|List of available enrollment type options|
|createdDateTime|DateTimeOffset|Profile creation time|
|defaultEnrollmentType|appleUserInitiatedEnrollmentType|The default profile enrollment type. Possible values are: `unknown`, `device`, `user`.|
|description|String|Description of the profile|
|displayName|String|Name of the profile|
|lastModifiedDateTime|DateTimeOffset|Profile last modified time|
|platform|devicePlatformType|The platform of the Device. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|priority|Int32|Priority, 0 is highest|



## Response

If successful, this method returns a `201 Created` response code and an [appleUserInitiatedEnrollmentProfile](../resources/appleuserinitiatedenrollmentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_appleuserinitiatedenrollmentprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/appleUserInitiatedEnrollmentProfiles
Content-Type: application/json
Content-length: 350

{
  "@odata.type": "#microsoft.graph.appleUserInitiatedEnrollmentProfile",
  "availableEnrollmentTypeOptions": [
    {
      "@odata.type": "microsoft.graph.appleOwnerTypeEnrollmentType"
    }
  ],
  "defaultEnrollmentType": "String",
  "description": "String",
  "displayName": "String",
  "platform": "String",
  "priority": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.appleUserInitiatedEnrollmentProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.appleUserInitiatedEnrollmentProfile",
  "id": "a7797890-7890-a779-9078-79a7907879a7",
  "availableEnrollmentTypeOptions": [
    {
      "@odata.type": "microsoft.graph.appleOwnerTypeEnrollmentType"
    }
  ],
  "createdDateTime": "String (timestamp)",
  "defaultEnrollmentType": "String",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "platform": "String",
  "priority": "Integer"
}
```

