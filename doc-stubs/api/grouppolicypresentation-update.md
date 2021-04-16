---
title: "Update groupPolicyPresentation"
description: "Update the properties of a groupPolicyPresentation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyPresentation
Namespace: microsoft.graph



Update the properties of a [groupPolicyPresentation](../resources/grouppolicypresentation.md) object.

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
PATCH /deviceManagement/groupPolicyCategories/{groupPolicyCategoryId}/definitionFile/definitions/{groupPolicyDefinitionId}/presentations/{groupPolicyPresentationId}
PATCH /deviceManagement/groupPolicyConfigurations/{groupPolicyConfigurationId}/definitionValues/{groupPolicyDefinitionValueId}/presentationValues/{groupPolicyPresentationValueId}/presentation
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyPresentation](../resources/grouppolicypresentation.md) object.

The following table shows the properties that are required when you update the [groupPolicyPresentation](../resources/grouppolicypresentation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty.|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyPresentation](../resources/grouppolicypresentation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicypresentation"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyCategories/{groupPolicyCategoryId}/definitionFile/definitions/{groupPolicyDefinitionId}/presentations/{groupPolicyPresentationId}
Content-Type: application/json
Content-length: 87

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentation",
  "label": "String"
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
  "@odata.type": "#microsoft.graph.groupPolicyPresentation",
  "id": "da32bd7b-bd7b-da32-7bbd-32da7bbd32da",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

