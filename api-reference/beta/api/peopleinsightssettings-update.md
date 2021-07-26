---
title: "Update peopleInsights"
description: "Update properties of peopleInsightsSettings object"
author: "simonhult"
localization_priority: Normal
ms.prod: "insights"
doc_type: "apiPageType"
---

# Update peopleInsightsSettings

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update properties of the specified [peopleInsightsSettings](../resources/peopleinsightssettings.md) resource.

To learn how to customize people insights privacy for your organization, see [customize insights privacy](/graph/insights-customize-people-insights-privacy?view=graph-rest-1.0). 

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | User.ReadWrite.All |
|Delegated (personal Microsoft account) | Not supported.    |
|Application | Not supported. |

>**Note:** Using delegated permissions for this operation requires the signed-in user to have a global administrator role.

## HTTP request
<!-- { "blockType": "ignored" } -->

```http
PATCH /organization/{organizationId}/settings/peopleInsights
```

## Request headers

| Header       | Value|
|:-----------|:------|
| Authorization  | Bearer {token}. Required.  |
| Content-Type  | application/json  |

## Request body

In the request body, supply the values for relevant fields that should be updated. Existing properties that are not included in the request body will maintain their previous values or be recalculated based on changes to other property values. For best performance you shouldn't include existing values that haven't changed.

| Property	   | Type	|Description|
|:---------------|:--------|:----------|
|isEnabledInOrganization|Boolean| `true` if organization people insights are enabled; `false` if organization people insights are disabled for all users without exceptions. Default is `true`. Optional.|
|disabledForGroup|String| The ID of an Azure AD group, of which the members' people insights are disabled. Default is `empty`. Optional.|

## Response

If successful, this method returns a `200 OK` response code and [peopleInsightsSettings](../resources/peopleinsightssettings.md) object in the response body.

>**Note:** This operation verifies the validity of property values of the specified **peopleInsightsSettings** resource. If the **disabledForGroup** property is set, this operation does not check the existence of the corresponding Azure AD Group. This means, if you set **disabledForGroup** to an Azure AD group that did not exist or was deleted afterwards, this operation will not be able to identify any group membership and disable people insights for any specific users. If **isEnabledInOrganization** is set to `true`, the operation will enable insights for all the users in the organization. 

## Example 

### Request

Here is an example request on how admin updates "**disabledForGroup**" privacy setting in order to prohibit displaying users' people insights of a particular Azure AD group.

# [HTTP](#tab/http)
<!-- {
  "blockType": "request",
  "name": "update_peopleinsightssettings"
}-->

```http
PATCH https://graph.microsoft.com/beta/organization/{organizationId}/settings/peopleInsights
Content-type: application/json

{
  "disabledForGroup": "edbfe4fb-ec70-4300-928f-dbb2ae86c981"
}
```
# [JavaScript](#tab/javascript)
[!INCLUDE [sample-code](../includes/snippets/javascript/update-peopleinsightssettings-javascript-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [C#](#tab/csharp)
[!INCLUDE [sample-code](../includes/snippets/csharp/update-peopleinsightssettings-csharp-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Objective-C](#tab/objc)
[!INCLUDE [sample-code](../includes/snippets/objc/update-peopleinsightssettings-objc-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Java](#tab/java)
[!INCLUDE [sample-code](../includes/snippets/java/update-peopleinsightssettings-java-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

---


##### Response

Here is an example of the response. Note: The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.insightsSettings",
  "name": "update_peopleinsightssettings"
} -->

```http
HTTP/1.1 200 OK
Content-type: application/json

{
  "isEnabledInOrganization": true,
  "disabledForGroup": "edbfe4fb-ec70-4300-928f-dbb2ae86c981"
}
```


