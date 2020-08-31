/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_list_push_front.c                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: zmarth <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/27 22:47:23 by zmarth            #+#    #+#             */
/*   Updated: 2020/08/27 22:58:03 by zmarth           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "ft_list.h"

void	ft_list_push_front(t_list **begin_list, void *data)
{
	t_list *list;

	if (!(list = (t_list *)malloc(sizeof(t_list))))
		return (0);
	list->next = *begin_list;
	list->data = data;
	*begin_list = list;
}
