---
title: "Create mobileAppProvisioningConfigGroupAssignment"
description: "Create a new mobileAppProvisioningConfigGroupAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mobileAppProvisioningConfigGroupAssignment
Namespace: microsoft.graph



Create a new [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object.

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
POST /deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfigurationId}/groupAssignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object.

The following table shows the properties that are required when you create the [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetGroupId|String|The ID of the AAD group in which the app provisioning configuration is being targeted.|



## Response

If successful, this method returns a `201 Created` response code and a [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mobileappprovisioningconfiggroupassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfigurationId}/groupAssignments
Content-Type: application/json
Content-length: 114

{
  "@odata.type": "#microsoft.graph.mobileAppProvisioningConfigGroupAssignment",
  "targetGroupId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mobileAppProvisioningConfigGroupAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.mobileAppProvisioningConfigGroupAssignment",
  "id": "dfdd45de-45de-dfdd-de45-dddfde45dddf",
  "targetGroupId": "String"
}
```

