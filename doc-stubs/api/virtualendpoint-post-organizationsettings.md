---
title: "Create cloudPcOrganizationSettings"
description: "Create a new cloudPcOrganizationSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create cloudPcOrganizationSettings
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md) object.

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
POST ** Collection URI for microsoft.graph.cloudPcOrganizationSettings not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md) object.

You can specify the following properties when creating a **cloudPcOrganizationSettings**.

|Property|Type|Description|
|:---|:---|:---|
|userAccountType|cloudPcUserAccountType|**TODO: Add Description**. The possible values are: `standardUser`, `administrator`, `unknownFutureValue`. Optional.|
|osVersion|cloudPcOperatingSystem|**TODO: Add Description**. The possible values are: `windows10`, `windows11`, `unknownFutureValue`. Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_cloudpcorganizationsettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.cloudPcOrganizationSettings not found
Content-Type: application/json
Content-length: 127

{
  "@odata.type": "#microsoft.graph.cloudPcOrganizationSettings",
  "userAccountType": "String",
  "osVersion": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.cloudPcOrganizationSettings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.cloudPcOrganizationSettings",
  "id": "8660bf17-bf17-8660-17bf-608617bf6086",
  "userAccountType": "String",
  "osVersion": "String"
}
```

